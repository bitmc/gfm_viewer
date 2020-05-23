# GFM Viewer plugin for Eclipse

* This project is a fork of [satyagraha/gfm_viewer](https://github.com/satyagraha/gfm_viewer).

## Fixed from Original

* Changed password auth to access token auth because of [deprecating password auth in GitHub API](https://developer.github.com/changes/2020-02-14-deprecating-password-auth/).
* Changed some Maven settings.

## Supported Versions

* We have fixed and installed the plugin in Eclipse `2020-03` for Windows 10.

## How to Install

1. Uninstall [previous versions](https://marketplace.eclipse.org/content/github-flavored-markdown-viewer-plugin) and shutdown Eclipse.
3. Download `code.satyagraha.gfm.viewer.plugin_2.0.1.jar` from [releases page](https://github.com/bitmc/gfm_viewer/releases).
4. Put the JAR file into the `dropins` directory like below.
	```
	eclipse/
	  dropins/
	    gfm_viewer/
	      eclipse/
	        plugins/
	          code.satyagraha.gfm.viewer.plugin_2.0.1.jar
	  workspace/
	  eclipse.exe
	  ......
	```
5. Launch Eclipse in clean mode.
6. Open `Window > Preferences` and select `GFM Viewer`.
7. Put a [personal access token](https://help.github.com/en/github/authenticating-to-github/creating-a-personal-access-token-for-the-command-line) into the `Access Token` field and apply.
	* This plugin does not require any scopes because it only uses [Markdown API](https://developer.github.com/v3/markdown/).

## How to Build

1. Install Eclipse plugins below.
	* `Eclipse Plugin Development Environment (PDE)`
	* `SWTBot for Eclipse Testing`
3. Clone this Git repository and import it as an Eclipse project.
4. Fix Java build path in each project.
4. Build `GFM Viewer ext-deps`.
	* The artifact will be created at `./plugin/lib/code.satyagraha.gfm.viewer.ext-deps-2.0.1.jar`.
5. Build `GFM Viewer plugin`.
	* Open `plugin.xml` and deploy the plugin.

## License

* Eclipse Public License 1.0
