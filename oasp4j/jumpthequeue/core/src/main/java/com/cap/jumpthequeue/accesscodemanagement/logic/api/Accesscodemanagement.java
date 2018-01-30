package com.cap.jumpthequeue.accesscodemanagement.logic.api;

import com.cap.jumpthequeue.accesscodemanagement.logic.api.to.AccessCodeCto;
import com.cap.jumpthequeue.accesscodemanagement.logic.api.to.AccessCodeEto;
import com.cap.jumpthequeue.accesscodemanagement.logic.api.to.AccessCodeSearchCriteriaTo;
import com.cap.jumpthequeue.usermanagement.logic.api.to.UserSearchCriteriaTo;

import io.oasp.module.jpa.common.api.to.PaginatedListTo;

/**
 * Interface for Accesscodemanagement component.
 */
public interface Accesscodemanagement {

  /**
   * Returns a AccessCode by its id 'id'.
   *
   * @param id The id 'id' of the AccessCode.
   * @return The {@link AccessCodeEto} with id 'id'
   */
  AccessCodeCto findAccessCode(Long id);

  /**
   * Returns a paginated list of AccessCodes matching the search criteria.
   *
   * @param criteria the {@link AccessCodeSearchCriteriaTo}.
   * @return the {@link List} of matching {@link AccessCodeEto}s.
   */
  PaginatedListTo<AccessCodeEto> findAccessCodeEtos(AccessCodeSearchCriteriaTo criteria);

  /**
   * Deletes a accessCode from the database by its id 'accessCodeId'.
   *
   * @param accessCodeId Id of the accessCode to delete
   * @return boolean <code>true</code> if the accessCode can be deleted, <code>false</code> otherwise
   */
  boolean deleteAccessCode(Long accessCodeId);

  /**
   * Saves a accessCode and store it in the database.
   *
   * @param accessCode the {@link AccessCodeEto} to create.
   * @return the new {@link AccessCodeEto} that has been saved with ID and version.
   */
  AccessCodeEto saveAccessCode(AccessCodeEto accessCode);

  /**
   * @param token
   * @return
   */
  AccessCodeCto getVisitorAccessCode(String token);

  /**
   * @param token
   * @return
   */
  AccessCodeCto getVIPAccessCode(String token);

  /**
   * @param queue_id
   * @return
   */
  AccessCodeCto getAttendingAccessCode(long queue_id);

  /**
   * @param searchCriteriaTo
   * @return
   */
  AccessCodeCto findExistingAccessCodesByPost(UserSearchCriteriaTo searchCriteriaTo);

  /**
   * @param number
   * @return
   */
  AccessCodeEto makeAccessCode(long number);

}