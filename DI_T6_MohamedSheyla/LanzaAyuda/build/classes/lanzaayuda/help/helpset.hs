<?xml version='1.0' encoding='UTF-8'?>
<!DOCTYPE helpset
  PUBLIC "-//Sun Microsystems Inc.//DTD JavaHelp HelpSet Version 2.0//EN"
         "http://java.sun.com/products/javahelp/helpset_2_0.dtd">

<helpset version="2.0" xml:lang="es-ES">
	<title>Ayuda</title>
	<maps>
		<homeID> Ayuda </homeID>
		<mapref location="map.xml"/>
	</maps>
	<view mergetype="javax.help.AppendMerge">
		<name>TOC</name>
		<label>Table of Contents</label>
		<type>javax.help.TOCView</type>
		<data>TOC.xml</data>
	</view>
	<view mergetype="javax.help.AppendMerge">
		<name>Index</name>
		<label>Index</label>
		<type>javax.help.IndexView</type>
		<data>index.xml</data>
	</view>
	<view>
		<name>Search</name>
		<label>Search</label>
		<type>javax.help.SearchView</type>
		<data engine="com.sun.java.help.search.DefaultSearchEngine">JavaHelpSearch</data>
	</view>
	<view>
		<name>Favorites</name>
		<label>Favorites</label>
		<type>javax.help.FavoritesView</type>
	</view>
</helpset>