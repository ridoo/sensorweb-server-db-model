/*
 * Copyright 2015-2018 52°North Initiative for Geospatial Open Source
 * Software GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.n52.series.db.beans.dataset;

import org.n52.series.db.beans.data.Data;

public interface ProfileDataset extends Dataset {

    @Override
    default String getDefaultValueType() {
        return Data.ProfileData.VALUE_TYPE;
    }

    String getVerticalParameterName();

    void setVerticalParameterName(String verticalParameterName);

    String getVerticalFromParameterName();

    void setVerticalFromParameterName(String verticalFromParameterName);

    String getVerticalToParameterName();

    void setVerticalToParameterName(String verticalToParameterName);

}
