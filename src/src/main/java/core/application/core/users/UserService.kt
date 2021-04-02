package core.application.core.users

import core.domain.core.IUserRepository
import core.domain.core.users.User
import javax.enterprise.context.ApplicationScoped
import javax.inject.Inject

@ApplicationScoped
class UserService : IUserService{

    @Inject
    var userRepository: IUserRepository? = null

    override fun findAll(): List<User>? {
        return userRepository?.findAll()?.list()
    }

    override fun persist(user: User) {
        userRepository?.persist(user)
    }

    override fun update(user: User) {
        userRepository?.update("id", user.id, user)
    }
}