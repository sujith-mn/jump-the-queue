package com.cap.jumpthequeue.visitorinfomanagement.dataaccess.api.dao;

import com.cap.jumpthequeue.general.dataaccess.api.dao.ApplicationDao;
import com.cap.jumpthequeue.visitorinfomanagement.dataaccess.api.VisitorInfoEntity;
import com.cap.jumpthequeue.visitorinfomanagement.logic.api.to.VisitorInfoSearchCriteriaTo;

import io.oasp.module.jpa.common.api.to.PaginatedListTo;

/**
 * Data access interface for VisitorInfo entities
 */
public interface VisitorInfoDao extends ApplicationDao<VisitorInfoEntity> {

  /**
   * Finds the {@link VisitorInfoEntity visitorinfos} matching the given {@link VisitorInfoSearchCriteriaTo}.
   *
   * @param criteria is the {@link VisitorInfoSearchCriteriaTo}.
   * @return the {@link PaginatedListTo} with the matching {@link VisitorInfoEntity} objects.
   */
  PaginatedListTo<VisitorInfoEntity> findVisitorInfos(VisitorInfoSearchCriteriaTo criteria);
}
