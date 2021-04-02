package core.infrastructure.repositories.users

import core.domain.core.User
import io.quarkus.hibernate.orm.panache.kotlin.PanacheRepository
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class UserRepository  : PanacheRepository<User>