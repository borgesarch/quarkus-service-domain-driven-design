package core.infrastructure.events.consumers.users

import core.application.core.users.IUserService
import core.domain.core.users.User
import io.smallrye.common.annotation.Blocking
import io.vertx.core.json.Json
import org.eclipse.microprofile.reactive.messaging.Channel
import org.eclipse.microprofile.reactive.messaging.Incoming
import javax.inject.Inject
import javax.inject.Singleton
import javax.transaction.Transactional

@Singleton
class UserConsumer {

    @Inject
    var userService: IUserService? = null

    @Channel("user-topic")
    @Incoming("user-topic")
    @Transactional
    @Blocking
    fun persist(record: String) {
        val user = Json.decodeValue(record, User::class.java)
        user?.let { userService?.persist(it) }
    }
}