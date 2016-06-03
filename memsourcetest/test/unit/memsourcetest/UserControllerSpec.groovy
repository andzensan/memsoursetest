package memsourcetest

import grails.test.mixin.Mock
import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(UserController)
@Mock([User,MemsourceService])
class UserControllerSpec extends Specification {

	MemsourceService memsourceService = new MemsourceService()
    def setup() {
		controller.memsourceService = memsourceService
    }

    def cleanup() {
    }

    void "Test update redirect to home"(){
        when:"The edit action"
        controller.update("test"," test")


        then:"A redirect is issued"
        response.redirectedUrl == "/user/index"    
    }
}
