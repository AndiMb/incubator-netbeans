/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.netbeans.modules.css.model.api;

import org.netbeans.modules.css.lib.api.properties.ResolvedProperty;

/**
 *
 * @author marekfukala
 */
public interface PropertyDeclaration extends Element {
    
    public Property getProperty();
    
    public void setProperty(Property property);
    
    public PropertyValue getPropertyValue();
    
    public void setPropertyValue(PropertyValue propertyValue);
    
    public Prio getPrio();
    
    public void setPrio(Prio prio);
    
     /**
     * Returns an instance of {@link ResolvedProperty} which is an object
     * encapsulation result of the css property value parsing.
     */
    public ResolvedProperty getResolvedProperty();
    
}
