org.springframework.cloud.contract.spec.Contract.make {
    description("""
        send messages by rabbitmq
    """)
    label "notification.event"
    // input to the contract
    input {
        // the contract will be triggered by a method
        triggeredBy('send()')
    }
    outputMessage {
        sentTo "output"
        body([
            body: "test message",
            type: "MESSAGE"
        ])
        headers {
            header("contentType", regex(".*application/.*json.*"))
            //header("__TypeId__", "com.example.demo.Message")
        }
    }
}
