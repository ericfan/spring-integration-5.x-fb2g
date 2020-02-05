package com.example.fb2g.aggregator;

import com.example.fb2g.bean.IntBean;
import com.example.fb2g.bean.ResponseBean;
import com.example.fb2g.bean.StringBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.integration.aggregator.AbstractAggregatingMessageGroupProcessor;
import org.springframework.integration.store.MessageGroup;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

@Component
public class GroupProcessorAggregator extends AbstractAggregatingMessageGroupProcessor {

    Logger logger = LoggerFactory.getLogger(GroupProcessorAggregator.class);

    @Override
    protected Object aggregatePayloads(MessageGroup group, Map<String, Object> defaultHeaders) {
        logger.info("GroupId is {} " + group.getGroupId());
        logger.info("SeqSize is {} " + group.getSequenceSize());

        Collection<Message<?>> results = group.getMessages();
        List<ResponseBean> resList = new ArrayList<>();
        for (Message result : results) {
            ResponseBean bean = new ResponseBean();
            Object object = result.getPayload();
            if (object instanceof IntBean) {
                bean.setResNum(((IntBean) object).getResNum());
            } else if (object instanceof StringBean) {
                bean.setResStr(((StringBean) object).getResStr());
            }
            resList.add(bean);
        }

        return resList;
    }
}
