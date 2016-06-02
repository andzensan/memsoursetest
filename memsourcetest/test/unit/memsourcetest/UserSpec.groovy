package memsourcetest

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(User)
class UserSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "Valid User creation"() {
 		when: "user is created with valid params"
 		def user = new User(username: "Test", password: "test1")

 		then:
 		user.validate()
 	}
}
