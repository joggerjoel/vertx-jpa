/*
 * Copyright (c) 2011-2014 The original author or authors
 * ------------------------------------------------------
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Apache License v2.0 which accompanies this distribution.
 *
 *     The Eclipse Public License is available at
 *     http://www.eclipse.org/legal/epl-v10.html
 *
 *     The Apache License v2.0 is available at
 *     http://www.opensource.org/licenses/apache2.0.php
 *
 * You may elect to redistribute this code under either of these licenses.
 */
package io.vertx.ext.jpa.spi;

import java.util.List;
import java.util.Properties;

import javax.persistence.spi.PersistenceUnitInfo;
import javax.persistence.spi.PersistenceUnitTransactionType;

/**
 * The Interface DefaultPersistanceUnitInfo.
 */
public interface SmartPersistanceUnitInfo extends PersistenceUnitInfo {

  /**
   * Adds the annotated class name.
   *
   * @param clazz
   *          the clazz
   */
  void addAnnotatedClassName(Class<?> clazz);

  /**
   * Adds the annotated class name.
   *
   * @param className
   *          the class name
   */
  void addAnnotatedClassName(String className);

  /**
   * Gets the managed packages.
   *
   * @return the managed packages
   */
  List<String> getManagedPackages();

  /**
   * Sets the persistence provider package name.
   *
   * @param persistenceProviderPackageName
   *          the new persistence provider package 'name
   */
  void setPersistenceProviderPackageName(String persistenceProviderPackageName);

  /**
   * Sets the properties.
   *
   * @param properties
   *          the new properties
   */
  void setProperties(Properties properties);

  /**
   * Sets the transaction type.
   *
   * @param resourceLocal
   *          the new transaction type
   */
  void setTransactionType(PersistenceUnitTransactionType resourceLocal);
}