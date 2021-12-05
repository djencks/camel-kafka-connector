/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.kafkaconnector.googlesheetssource;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSourceConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelGooglesheetssourceSourceConnectorConfig
        extends
            CamelSourceConnectorConfig {

    public static final String CAMEL_SOURCE_GOOGLESHEETSSOURCE_KAMELET_INDEX_CONF = "camel.kamelet.google-sheets-source.index";
    public static final String CAMEL_SOURCE_GOOGLESHEETSSOURCE_KAMELET_INDEX_DOC = "An index for the google sheets endpoint";
    public static final String CAMEL_SOURCE_GOOGLESHEETSSOURCE_KAMELET_INDEX_DEFAULT = null;
    public static final String CAMEL_SOURCE_GOOGLESHEETSSOURCE_KAMELET_SPREADSHEET_ID_CONF = "camel.kamelet.google-sheets-source.spreadsheetId";
    public static final String CAMEL_SOURCE_GOOGLESHEETSSOURCE_KAMELET_SPREADSHEET_ID_DOC = "The Spreadsheet ID to be used as events source";
    public static final String CAMEL_SOURCE_GOOGLESHEETSSOURCE_KAMELET_SPREADSHEET_ID_DEFAULT = null;
    public static final String CAMEL_SOURCE_GOOGLESHEETSSOURCE_KAMELET_CLIENT_ID_CONF = "camel.kamelet.google-sheets-source.clientId";
    public static final String CAMEL_SOURCE_GOOGLESHEETSSOURCE_KAMELET_CLIENT_ID_DOC = "Client ID of the sheets application";
    public static final String CAMEL_SOURCE_GOOGLESHEETSSOURCE_KAMELET_CLIENT_ID_DEFAULT = null;
    public static final String CAMEL_SOURCE_GOOGLESHEETSSOURCE_KAMELET_CLIENT_SECRET_CONF = "camel.kamelet.google-sheets-source.clientSecret";
    public static final String CAMEL_SOURCE_GOOGLESHEETSSOURCE_KAMELET_CLIENT_SECRET_DOC = "Client Secret of the sheets application";
    public static final String CAMEL_SOURCE_GOOGLESHEETSSOURCE_KAMELET_CLIENT_SECRET_DEFAULT = null;
    public static final String CAMEL_SOURCE_GOOGLESHEETSSOURCE_KAMELET_ACCESS_TOKEN_CONF = "camel.kamelet.google-sheets-source.accessToken";
    public static final String CAMEL_SOURCE_GOOGLESHEETSSOURCE_KAMELET_ACCESS_TOKEN_DOC = "OAuth 2 access token for google sheets application. This typically expires after an hour so refreshToken is recommended for long term usage.";
    public static final String CAMEL_SOURCE_GOOGLESHEETSSOURCE_KAMELET_ACCESS_TOKEN_DEFAULT = null;
    public static final String CAMEL_SOURCE_GOOGLESHEETSSOURCE_KAMELET_REFRESH_TOKEN_CONF = "camel.kamelet.google-sheets-source.refreshToken";
    public static final String CAMEL_SOURCE_GOOGLESHEETSSOURCE_KAMELET_REFRESH_TOKEN_DOC = "OAuth 2 refresh token for google sheets application. Using this, the Google Calendar component can obtain a new accessToken whenever the current one expires - a necessity if the application is long-lived.";
    public static final String CAMEL_SOURCE_GOOGLESHEETSSOURCE_KAMELET_REFRESH_TOKEN_DEFAULT = null;
    public static final String CAMEL_SOURCE_GOOGLESHEETSSOURCE_KAMELET_DELAY_CONF = "camel.kamelet.google-sheets-source.delay";
    public static final String CAMEL_SOURCE_GOOGLESHEETSSOURCE_KAMELET_DELAY_DOC = "Milliseconds before the next poll";
    public static final Integer CAMEL_SOURCE_GOOGLESHEETSSOURCE_KAMELET_DELAY_DEFAULT = 500;
    public static final String CAMEL_SOURCE_GOOGLESHEETSSOURCE_KAMELET_REPEAT_COUNT_CONF = "camel.kamelet.google-sheets-source.repeatCount";
    public static final String CAMEL_SOURCE_GOOGLESHEETSSOURCE_KAMELET_REPEAT_COUNT_DOC = "Specifies a maximum limit of number of fires";
    public static final Integer CAMEL_SOURCE_GOOGLESHEETSSOURCE_KAMELET_REPEAT_COUNT_DEFAULT = null;
    public static final String CAMEL_SOURCE_GOOGLESHEETSSOURCE_KAMELET_APPLICATION_NAME_CONF = "camel.kamelet.google-sheets-source.applicationName";
    public static final String CAMEL_SOURCE_GOOGLESHEETSSOURCE_KAMELET_APPLICATION_NAME_DOC = "Google Sheets application name";
    public static final String CAMEL_SOURCE_GOOGLESHEETSSOURCE_KAMELET_APPLICATION_NAME_DEFAULT = null;
    public static final String CAMEL_SOURCE_GOOGLESHEETSSOURCE_KAMELET_SPLIT_RESULTS_CONF = "camel.kamelet.google-sheets-source.splitResults";
    public static final String CAMEL_SOURCE_GOOGLESHEETSSOURCE_KAMELET_SPLIT_RESULTS_DOC = "True if value range result should be split into rows or columns to process each of them individually.";
    public static final Boolean CAMEL_SOURCE_GOOGLESHEETSSOURCE_KAMELET_SPLIT_RESULTS_DEFAULT = true;
    public static final String CAMEL_SOURCE_GOOGLESHEETSSOURCE_KAMELET_RANGE_CONF = "camel.kamelet.google-sheets-source.range";
    public static final String CAMEL_SOURCE_GOOGLESHEETSSOURCE_KAMELET_RANGE_DOC = "the range of rows and columns in a sheet to get data from. Example: A1:B3";
    public static final Boolean CAMEL_SOURCE_GOOGLESHEETSSOURCE_KAMELET_RANGE_DEFAULT = null;

    public CamelGooglesheetssourceSourceConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelGooglesheetssourceSourceConnectorConfig(
            Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSourceConnectorConfig.conf());
        conf.define(CAMEL_SOURCE_GOOGLESHEETSSOURCE_KAMELET_INDEX_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_GOOGLESHEETSSOURCE_KAMELET_INDEX_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_GOOGLESHEETSSOURCE_KAMELET_INDEX_DOC);
        conf.define(CAMEL_SOURCE_GOOGLESHEETSSOURCE_KAMELET_SPREADSHEET_ID_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_GOOGLESHEETSSOURCE_KAMELET_SPREADSHEET_ID_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_GOOGLESHEETSSOURCE_KAMELET_SPREADSHEET_ID_DOC);
        conf.define(CAMEL_SOURCE_GOOGLESHEETSSOURCE_KAMELET_CLIENT_ID_CONF, ConfigDef.Type.PASSWORD, CAMEL_SOURCE_GOOGLESHEETSSOURCE_KAMELET_CLIENT_ID_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_GOOGLESHEETSSOURCE_KAMELET_CLIENT_ID_DOC);
        conf.define(CAMEL_SOURCE_GOOGLESHEETSSOURCE_KAMELET_CLIENT_SECRET_CONF, ConfigDef.Type.PASSWORD, CAMEL_SOURCE_GOOGLESHEETSSOURCE_KAMELET_CLIENT_SECRET_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_GOOGLESHEETSSOURCE_KAMELET_CLIENT_SECRET_DOC);
        conf.define(CAMEL_SOURCE_GOOGLESHEETSSOURCE_KAMELET_ACCESS_TOKEN_CONF, ConfigDef.Type.PASSWORD, CAMEL_SOURCE_GOOGLESHEETSSOURCE_KAMELET_ACCESS_TOKEN_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_GOOGLESHEETSSOURCE_KAMELET_ACCESS_TOKEN_DOC);
        conf.define(CAMEL_SOURCE_GOOGLESHEETSSOURCE_KAMELET_REFRESH_TOKEN_CONF, ConfigDef.Type.PASSWORD, CAMEL_SOURCE_GOOGLESHEETSSOURCE_KAMELET_REFRESH_TOKEN_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_GOOGLESHEETSSOURCE_KAMELET_REFRESH_TOKEN_DOC);
        conf.define(CAMEL_SOURCE_GOOGLESHEETSSOURCE_KAMELET_DELAY_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_GOOGLESHEETSSOURCE_KAMELET_DELAY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GOOGLESHEETSSOURCE_KAMELET_DELAY_DOC);
        conf.define(CAMEL_SOURCE_GOOGLESHEETSSOURCE_KAMELET_REPEAT_COUNT_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_GOOGLESHEETSSOURCE_KAMELET_REPEAT_COUNT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GOOGLESHEETSSOURCE_KAMELET_REPEAT_COUNT_DOC);
        conf.define(CAMEL_SOURCE_GOOGLESHEETSSOURCE_KAMELET_APPLICATION_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_GOOGLESHEETSSOURCE_KAMELET_APPLICATION_NAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_GOOGLESHEETSSOURCE_KAMELET_APPLICATION_NAME_DOC);
        conf.define(CAMEL_SOURCE_GOOGLESHEETSSOURCE_KAMELET_SPLIT_RESULTS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_GOOGLESHEETSSOURCE_KAMELET_SPLIT_RESULTS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GOOGLESHEETSSOURCE_KAMELET_SPLIT_RESULTS_DOC);
        conf.define(CAMEL_SOURCE_GOOGLESHEETSSOURCE_KAMELET_RANGE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_GOOGLESHEETSSOURCE_KAMELET_RANGE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GOOGLESHEETSSOURCE_KAMELET_RANGE_DOC);
        return conf;
    }
}