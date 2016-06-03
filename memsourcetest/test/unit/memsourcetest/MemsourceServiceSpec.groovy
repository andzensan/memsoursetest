package memsourcetest

import grails.test.mixin.TestFor
import spock.lang.Specification
import grails.test.mixin.Mock
import memsourcetest.User

/**
 * See the API for {@link grails.test.mixin.services.ServiceUnitTestMixin} for usage instructions
 */
@TestFor(MemsourceService)
@Mock(User)
class MemsourceServiceSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

	void "Test update user"() {
		when: "Update with valid params"
		def userBefore = new User(username: "Test", password: "test1").save()
		def userAfter = service.updateUser('newusername', 'test')

		then:
		userAfter.validate()
	}
}
