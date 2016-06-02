package memsourcetest

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(UserController)
class UserControllerSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "Test update redirect to home"(){
        when:"The edit action is executed with a null domain"
        controller.update("test"," test")

        then:"A redirect is issued"
        response.redirectedUrl == "/user/index"    
    }
}
