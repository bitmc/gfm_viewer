package code.satyagraha.gfm.viewer.plugin.preferences;

import static code.satyagraha.gfm.viewer.plugin.preferences.PreferenceConstants.P_API_URL;
import static code.satyagraha.gfm.viewer.plugin.preferences.PreferenceConstants.P_CSS_URL_1;
import static code.satyagraha.gfm.viewer.plugin.preferences.PreferenceConstants.P_CSS_URL_2;
import static code.satyagraha.gfm.viewer.plugin.preferences.PreferenceConstants.P_CSS_URL_3;
import static code.satyagraha.gfm.viewer.plugin.preferences.PreferenceConstants.P_JS_URL_1;
import static code.satyagraha.gfm.viewer.plugin.preferences.PreferenceConstants.P_JS_URL_2;
import static code.satyagraha.gfm.viewer.plugin.preferences.PreferenceConstants.P_JS_URL_3;
import static code.satyagraha.gfm.viewer.plugin.preferences.PreferenceConstants.P_PASSWORD;
import static code.satyagraha.gfm.viewer.plugin.preferences.PreferenceConstants.P_TEMPLATE;
import static code.satyagraha.gfm.viewer.plugin.preferences.PreferenceConstants.P_USE_ECLIPSE_CONSOLE;
import static code.satyagraha.gfm.viewer.plugin.preferences.PreferenceConstants.P_MARKDOWN_EXTENSIONS;
import static code.satyagraha.gfm.viewer.plugin.preferences.PreferenceConstants.P_USE_TEMP_DIR;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

import code.satyagraha.gfm.support.api.Config;
import code.satyagraha.gfm.support.impl.ConfigDefault;
import code.satyagraha.gfm.viewer.plugin.Activator;


/**
 * Class used to initialize default preference values.
 */
public class PreferenceInitializer extends AbstractPreferenceInitializer {

    private final static Config configDefault = new ConfigDefault();
    
    public static Config getConfigDefault() {
        return configDefault;
    }
    
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#initializeDefaultPreferences()
	 */
	@Override
    public void initializeDefaultPreferences() {
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		store.setDefault(P_USE_TEMP_DIR, getConfigDefault().useTempDir());
		store.setDefault(P_API_URL, getConfigDefault().getApiUrl());
		store.setDefault(P_PASSWORD, "");
		store.setDefault(P_TEMPLATE, "");
		store.setDefault(P_CSS_URL_1, "");
		store.setDefault(P_CSS_URL_2, "");
		store.setDefault(P_CSS_URL_3, "");
		store.setDefault(P_JS_URL_1, "");
		store.setDefault(P_JS_URL_2, "");
		store.setDefault(P_JS_URL_3, "");
		store.setDefault(P_USE_ECLIPSE_CONSOLE, getConfigDefault().useEclipseConsole());
		store.setDefault(P_MARKDOWN_EXTENSIONS, getConfigDefault().getMarkdownExtensions());
	}

}
