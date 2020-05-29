package ro.userspringapp.experiment.userservice;

import ro.userspringapp.experiment.ui.model.request.UserDetailsRequestModel;
import ro.userspringapp.experiment.ui.model.response.UserRest;

public interface UserService {
	UserRest createUser(UserDetailsRequestModel userDetails);
}
