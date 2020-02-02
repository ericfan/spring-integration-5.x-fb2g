# Spring Integration fb2g(From Beginning To GiveUp)
This is a personal project to show different scenarios in Spring Integration with real code. 

# Main Concept
Messages are exchanged between message endpoints via message channels. 
A message endpoints can have any number of (even zero) input and output message channels. 
<img src="src/docs/images/SpringIntegrationMainConcepts.png" width="900" height="300">

When a message endpoint consumes messages from a message channel: 
* **poll** - *actively read them*
* **listen** - *passively receive them*

Message channels: 
* **direct channel** - *pass through messages*
* **queue channel** - *temporarily store them in memory*

Message flow: 
* **bidirectional** - request-response nature
* **unidirectional** - fire-and-forget nature