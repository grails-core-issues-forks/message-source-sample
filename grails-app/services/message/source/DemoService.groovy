package message.source

import groovy.transform.CompileStatic
import org.springframework.context.MessageSource

@CompileStatic
class DemoService {

    MessageSource messageSource

    String foo() {
        return messageSource.getMessage('my.message', null, Locale.default)
    }
}
