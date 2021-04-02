package core.application.core.users

import core.domain.core.User
import core.infrastructure.repositories.users.UserRepository
import javax.enterprise.context.ApplicationScoped
import javax.inject.Inject

@ApplicationScoped
class UserService : IUserService{

    @Inject internal var userRepository: UserRepository? = null

    override fun findAll(): List<User>? {
        return userRepository?.findAll()?.list()
    }
}