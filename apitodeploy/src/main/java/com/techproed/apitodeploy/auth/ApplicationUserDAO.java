package com.techproed.apitodeploy.auth;

import java.util.Optional;

public interface ApplicationUserDAO {

	Optional<ApplicationUser> selectApplicationUserByUsername(String username);
}
