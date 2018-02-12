package message.source

class DemoController {

    DemoService demoService

    def index() {
        render demoService.foo()
    }
}
