/*
 * Copyright (c) 2018 NTT DATA INTELLILINK Corporation. All rights reserved.
 *
 * Hinemos (http://www.hinemos.info/)
 *
 * See the LICENSE file for licensing information.
 */

package com.clustercontrol.utility.settings.ui.preference;

import com.clustercontrol.utility.settings.ui.constant.XMLConstant;
import com.clustercontrol.utility.util.IUtilityPreferenceStore;

/**
 * 設定ページの初期値を設定<BR>
 * 
 * @version 6.1.0
 * @since 6.1.0
 */
public class SettingToolsXMLPreferenceInitializer {

	public static void init(IUtilityPreferenceStore store) {
		store.setDefault(PreferencePageConstant.KEY_XML, PreferencePageConstant.VALUE_XML);
		store.setDefault(PreferencePageConstant.KEY_DIFF_XML, PreferencePageConstant.VALUE_DIFF_XML);
		store.setDefault(PreferencePageConstant.KEY_DIFF_MODE, PreferencePageConstant.VALUE_DIFF_MODE);
		store.setDefault(PreferencePageConstant.VALUE_INFRA, PreferencePageConstant.VALUE_INFRA);
		store.setDefault(PreferencePageConstant.VALUE_NODEMAP_BG_FOLDER, PreferencePageConstant.VALUE_NODEMAP_BG_FOLDER);
		store.setDefault(PreferencePageConstant.VALUE_NODEMAP_ICON_FOLDER, PreferencePageConstant.VALUE_NODEMAP_ICON_FOLDER);
		
		store.setDefault(PreferencePageConstant.VALUE_JOBMAP_IMAGE_FOLDER, PreferencePageConstant.VALUE_JOBMAP_IMAGE_FOLDER);
		
		store.setDefault(PreferencePageConstant.KEY_BACKUP_IMPORT, PreferencePageConstant.DEFAULT_VALUE_BACKUP_IMPORT);
		store.setDefault(PreferencePageConstant.KEY_BACKUP_EXPORT, PreferencePageConstant.DEFAULT_VALUE_BACKUP_EXPORT);
		store.setDefault(PreferencePageConstant.KEY_BACKUP_CLEAR, PreferencePageConstant.DEFAULT_VALUE_BACKUP_CLEAR);
		store.setDefault(PreferencePageConstant.VALUE_BACKUP_FOLDER, PreferencePageConstant.VALUE_BACKUP_FOLDER);
		store.setDefault(XMLConstant.DEFAULT_XML_PLATFORM_ACCESS_USER,
				XMLConstant.DEFAULT_XML_PLATFORM_ACCESS_USER);
		store.setDefault(XMLConstant.DEFAULT_XML_PLATFORM_ACCESS_ROLE,
				XMLConstant.DEFAULT_XML_PLATFORM_ACCESS_ROLE);
		store.setDefault(XMLConstant.DEFAULT_XML_PLATFORM_ACCESS_ROLE_USER,
				XMLConstant.DEFAULT_XML_PLATFORM_ACCESS_ROLE_USER);
		store.setDefault(XMLConstant.DEFAULT_XML_PLATFORM_ACCESS_SYSTEM_PRIVILEGE,
				XMLConstant.DEFAULT_XML_PLATFORM_ACCESS_SYSTEM_PRIVILEGE);
		store.setDefault(XMLConstant.DEFAULT_XML_PLATFORM_ACCESS_OBJECT_PRIVILEGE,
				XMLConstant.DEFAULT_XML_PLATFORM_ACCESS_OBJECT_PRIVILEGE);
		store.setDefault(XMLConstant.DEFAULT_XML_PLATFORM_REPOSITORY_NODE,
				XMLConstant.DEFAULT_XML_PLATFORM_REPOSITORY_NODE);
		store.setDefault(
				XMLConstant.DEFAULT_XML_PLATFORM_REPOSITORY_NODE_HOSTNAME,
				XMLConstant.DEFAULT_XML_PLATFORM_REPOSITORY_NODE_HOSTNAME);
		store.setDefault(XMLConstant.DEFAULT_XML_PLATFORM_REPOSITORY_NODE_CPU,
				XMLConstant.DEFAULT_XML_PLATFORM_REPOSITORY_NODE_CPU);
		store.setDefault(
				XMLConstant.DEFAULT_XML_PLATFORM_REPOSITORY_NODE_MEMORY,
				XMLConstant.DEFAULT_XML_PLATFORM_REPOSITORY_NODE_MEMORY);
		store.setDefault(
				XMLConstant.DEFAULT_XML_PLATFORM_REPOSITORY_NODE_NETWORKINTERFACE,
				XMLConstant.DEFAULT_XML_PLATFORM_REPOSITORY_NODE_NETWORKINTERFACE);
		store.setDefault(XMLConstant.DEFAULT_XML_PLATFORM_REPOSITORY_NODE_DISK,
				XMLConstant.DEFAULT_XML_PLATFORM_REPOSITORY_NODE_DISK);
		store.setDefault(XMLConstant.DEFAULT_XML_PLATFORM_REPOSITORY_NODE_FS,
				XMLConstant.DEFAULT_XML_PLATFORM_REPOSITORY_NODE_FS);
		store.setDefault(
				XMLConstant.DEFAULT_XML_PLATFORM_REPOSITORY_NODE_DEVICE,
				XMLConstant.DEFAULT_XML_PLATFORM_REPOSITORY_NODE_DEVICE);
		store.setDefault(
				XMLConstant.DEFAULT_XML_PLATFORM_REPOSITORY_NODE_VARIABLE,
				XMLConstant.DEFAULT_XML_PLATFORM_REPOSITORY_NODE_VARIABLE);
		store.setDefault(XMLConstant.DEFAULT_XML_PLATFORM_REPOSITORY_NODE_NOTE,
				XMLConstant.DEFAULT_XML_PLATFORM_REPOSITORY_NODE_NOTE);
		store.setDefault(XMLConstant.DEFAULT_XML_PLATFORM_REPOSITORY_SCOPE,
				XMLConstant.DEFAULT_XML_PLATFORM_REPOSITORY_SCOPE);
		store.setDefault(
				XMLConstant.DEFAULT_XML_PLATFORM_REPOSITORY_SCOPE_NODE,
				XMLConstant.DEFAULT_XML_PLATFORM_REPOSITORY_SCOPE_NODE);
		store.setDefault(XMLConstant.DEFAULT_XML_PLATFORM_CALENDAR,
				XMLConstant.DEFAULT_XML_PLATFORM_CALENDAR);
		store.setDefault(XMLConstant.DEFAULT_XML_PLATFORM_CALENDAR_PATTERN,
				XMLConstant.DEFAULT_XML_PLATFORM_CALENDAR_PATTERN);
		store.setDefault(XMLConstant.DEFAULT_XML_PLATFORM_NOTIFY,
				XMLConstant.DEFAULT_XML_PLATFORM_NOTIFY);
		store.setDefault(XMLConstant.DEFAULT_XML_PLATFORM_MAIL_TEMPLATE,
				XMLConstant.DEFAULT_XML_PLATFORM_MAIL_TEMPLATE);
		store.setDefault(XMLConstant.DEFAULT_XML_PLATFORM_LOG_FORMAT,
				XMLConstant.DEFAULT_XML_PLATFORM_LOG_FORMAT);
		store.setDefault(XMLConstant.DEFAULT_XML_MONITOR_AGENT,
				XMLConstant.DEFAULT_XML_MONITOR_AGENT);
		store.setDefault(XMLConstant.DEFAULT_XML_MONITOR_HTTP,
				XMLConstant.DEFAULT_XML_MONITOR_HTTP);
		store.setDefault(XMLConstant.DEFAULT_XML_MONITOR_HTTP_SCENARIO,
				XMLConstant.DEFAULT_XML_MONITOR_HTTP_SCENARIO);
		store.setDefault(XMLConstant.DEFAULT_XML_MONITOR_PERFORMANCE,
				XMLConstant.DEFAULT_XML_MONITOR_PERFORMANCE);
		store.setDefault(XMLConstant.DEFAULT_XML_MONITOR_PING,
				XMLConstant.DEFAULT_XML_MONITOR_PING);
		store.setDefault(XMLConstant.DEFAULT_XML_MONITOR_PORT,
				XMLConstant.DEFAULT_XML_MONITOR_PORT);
		store.setDefault(XMLConstant.DEFAULT_XML_MONITOR_PROCESS,
				XMLConstant.DEFAULT_XML_MONITOR_PROCESS);
		store.setDefault(XMLConstant.DEFAULT_XML_MONITOR_SNMP,
				XMLConstant.DEFAULT_XML_MONITOR_SNMP);
		store.setDefault(XMLConstant.DEFAULT_XML_MONITOR_SNMPTRAP,
				XMLConstant.DEFAULT_XML_MONITOR_SNMPTRAP);
		store.setDefault(XMLConstant.DEFAULT_XML_MONITOR_SQL,
				XMLConstant.DEFAULT_XML_MONITOR_SQL);
		store.setDefault(XMLConstant.DEFAULT_XML_MONITOR_CUSTOM,
				XMLConstant.DEFAULT_XML_MONITOR_CUSTOM);
		store.setDefault(XMLConstant.DEFAULT_XML_MONITOR_SYSTEMLOG,
				XMLConstant.DEFAULT_XML_MONITOR_SYSTEMLOG);
		store.setDefault(XMLConstant.DEFAULT_XML_MONITOR_LOGFILE,
				XMLConstant.DEFAULT_XML_MONITOR_LOGFILE);
		store.setDefault(XMLConstant.DEFAULT_XML_MONITOR_WINSERVICE,
				XMLConstant.DEFAULT_XML_MONITOR_WINSERVICE);
		store.setDefault(XMLConstant.DEFAULT_XML_MONITOR_WINEVENT,
				XMLConstant.DEFAULT_XML_MONITOR_WINEVENT);
		store.setDefault(XMLConstant.DEFAULT_XML_MONITOR_JMX,
				XMLConstant.DEFAULT_XML_MONITOR_JMX);
		store.setDefault(XMLConstant.DEFAULT_XML_MONITOR_CUSTOMTRAP,
				XMLConstant.DEFAULT_XML_MONITOR_CUSTOMTRAP);
		
		store.setDefault(XMLConstant.DEFAULT_XML_MONITOR_LOGCOUNT,
				XMLConstant.DEFAULT_XML_MONITOR_LOGCOUNT);
		store.setDefault(XMLConstant.DEFAULT_XML_MONITOR_BINARYFILE,
				XMLConstant.DEFAULT_XML_MONITOR_BINARYFILE);
		store.setDefault(XMLConstant.DEFAULT_XML_MONITOR_PCAP,
				XMLConstant.DEFAULT_XML_MONITOR_PCAP);
		store.setDefault(XMLConstant.DEFAULT_XML_MONITOR_INTEGRATION,
				XMLConstant.DEFAULT_XML_MONITOR_INTEGRATION);
		store.setDefault(XMLConstant.DEFAULT_XML_MONITOR_CORRELATION,
				XMLConstant.DEFAULT_XML_MONITOR_CORRELATION);
		
		store.setDefault(XMLConstant.DEFAULT_XML_JOB_MST,
				XMLConstant.DEFAULT_XML_JOB_MST);
		store.setDefault(XMLConstant.DEFAULT_XML_JOB_SCHEDULE,
				XMLConstant.DEFAULT_XML_JOB_SCHEDULE);
		store.setDefault(XMLConstant.DEFAULT_XML_JOB_FILECHECK,
				XMLConstant.DEFAULT_XML_JOB_FILECHECK);
		store.setDefault(XMLConstant.DEFAULT_XML_JOB_MANUAL,
				XMLConstant.DEFAULT_XML_JOB_MANUAL);

		store.setDefault(XMLConstant.DEFAULT_XML_HUB_TRANSFER,
				XMLConstant.DEFAULT_XML_HUB_TRANSFER);

		store.setDefault(XMLConstant.DEFAULT_XML_SYSYTEM_MAINTENANCE,
				XMLConstant.DEFAULT_XML_SYSYTEM_MAINTENANCE);
		store.setDefault(XMLConstant.DEFAULT_XML_PLATFORM_HINEMOS_PROPERTY,
				XMLConstant.DEFAULT_XML_PLATFORM_HINEMOS_PROPERTY);

		store.setDefault(XMLConstant.DEFAULT_XML_INFRA_SETTING,
				XMLConstant.DEFAULT_XML_INFRA_SETTING);
		store.setDefault(XMLConstant.DEFAULT_XML_INFRA_FILE,
				XMLConstant.DEFAULT_XML_INFRA_FILE);

		store.setDefault(XMLConstant.DEFAULT_XML_MASTER_PLATFORM,
				XMLConstant.DEFAULT_XML_MASTER_PLATFORM);
		store.setDefault(XMLConstant.DEFAULT_XML_MASTER_COLLECT,
				XMLConstant.DEFAULT_XML_MASTER_COLLECT);
		store.setDefault(XMLConstant.DEFAULT_XML_MASTER_JMX,
				XMLConstant.DEFAULT_XML_MASTER_JMX);

		store.setDefault(XMLConstant.DEFAULT_XML_NODE_MAP_SETTING,
				XMLConstant.DEFAULT_XML_NODE_MAP_SETTING);
		store.setDefault(XMLConstant.DEFAULT_XML_NODE_MAP_IMAGE,
				XMLConstant.DEFAULT_XML_NODE_MAP_IMAGE);
		store.setDefault(XMLConstant.DEFAULT_XML_NODE_MAP_ICON,
				XMLConstant.DEFAULT_XML_NODE_MAP_ICON);

		store.setDefault(XMLConstant.DEFAULT_XML_REPORT_SCHEDULE,
				XMLConstant.DEFAULT_XML_REPORT_SCHEDULE);
		store.setDefault(XMLConstant.DEFAULT_XML_REPORT_TEMPLATE,
				XMLConstant.DEFAULT_XML_REPORT_TEMPLATE);

		store.setDefault(XMLConstant.DEFAULT_XML_JOBMAP_IMAGE,
				XMLConstant.DEFAULT_XML_JOBMAP_IMAGE);
		store.setDefault(XMLConstant.DEFAULT_XML_CLOUD_USER,
				XMLConstant.DEFAULT_XML_CLOUD_USER);
		store.setDefault(XMLConstant.DEFAULT_XML_CLOUD_MON_SERVICE,
				XMLConstant.DEFAULT_XML_CLOUD_MON_SERVICE);
		store.setDefault(XMLConstant.DEFAULT_XML_CLOUD_MON_BILLING,
				XMLConstant.DEFAULT_XML_CLOUD_MON_BILLING);
	}
}