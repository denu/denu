War overlay test case for https://github.com/jbosstools/m2e-wro4j/issues/2#issuecomment-6639548
==============================================================================

In Eclipse JavaEE Indigo SR2 + m2e 1.0.100 + m2e-wtp 0.15.2 :
* import as Maven project
* select parent, overlay, web projects, proceed with import
* Right click on test-web, Debug as > Debug on server
* select a server

Once the web project is deployed, check the deployment folder to make sure 
files all.css and all.js are created.
Those files contains only js and css files from test-web project, despite of
wro.xml has masks for /css/**.css and /js/**.js. After war overlays do their job
there are actually files from both projects in /css/ and /js/ folders.