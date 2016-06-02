package memsourcetest

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.services.ServiceUnitTestMixin} for usage instructions
 */
@TestFor(MemsourceService)
class MemsourceServiceSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

	void "Test update user"() {
		when: "Update with valid params"
		def userBefore = User.last()[0]
		def userAfter = service.updateUser('newusername', 'test')

		then:
		userAfter.validate()
	}
}
