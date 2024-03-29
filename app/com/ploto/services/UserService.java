package com.ploto.services;

import com.google.common.base.Preconditions;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.ploto.services.store.StoreException;
import com.ploto.services.store.UserServiceStore;
import com.ploto.util.PlotoContext;

/**
 * Created by jeff on 5/24/14.
 */
@Singleton
public class UserService {
  @Inject
  private UserServiceStore mUserServiceStore;

  @Inject
  private UserService() {
    mUserServiceStore = PlotoContext.getInjector().getInstance(UserServiceStore.class);
  }

  public User createUser(String email, String password) {
    Preconditions.checkNotNull(email);
    Preconditions.checkNotNull(password);
    Preconditions.checkArgument(email.length() > 0 && email.contains("@"), "Invalid email address");
    Preconditions.checkArgument(password.length() > 0, "Invalid password");

    User newUser = null;

    try {
      newUser = mUserServiceStore.createUser(email, password);
    } catch (StoreException ex) {

    }

    return newUser;
  }

  public void removeUser(String email) {
    Preconditions.checkNotNull(email);
    Preconditions.checkArgument(email.length() > 0 && email.contains("@"), "Invalid email address");

    try {
      mUserServiceStore.removeUser(email);
    } catch (StoreException ex) {

    }

  }

  public boolean authenicateUser(String email, String password) {
    return false;
  }

  public User fetchUser(String email) {
    Preconditions.checkNotNull(email);
    Preconditions.checkArgument(email.length() > 0 && email.contains("@"), "Invalid email address");

    User locatedUser = null;
    try {
      locatedUser = mUserServiceStore.fetchUser(email);
    } catch (StoreException ex) {

    }

    return locatedUser;
  }

  public boolean changePassword(String email, String oldPassword, String newPassword) {
    return false;
  }
}
