package com.silence.service

import com.silence.enties.User
import com.silence.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserService extends BaseService[User] {
  
    @Autowired var userRepository: UserRepository = _
  
}