<?xml version="1.0" encoding='ISO-8859-1' standalone="no" ?>
<!DOCTYPE helpset
PUBLIC "-//Sun Microsystems Inc.//DTD JavaHelp HelpSet Version 1.0//EN"
"http://java.sun.com/products/javahelp/helpset_1_0.dtd">
<helpset version="2.0">
   <title>uso de ayuda JavaHelp</title>
   <maps>
      <!-- Pagina por defecto al mostrar la ayuda -->
      <homeID>menu</homeID>
      <!-- Que mapa deseamos -->
      <mapref location="map.jhm"/>
   </maps>
   <!-- Las Vistas que deseamos mostrar en la ayuda -->
   <!-- La tabla de contenidos -->
   <view xml:lang="es" mergetype="javax.help.UniteAppendMerge">
      <name>TOC</name>
      <label>Tabla de contenidos</label>
      <type>javax.help.TOCView</type>
      <data>toc.xml</data>
   </view>
   <!-- El indice -->
   <view xml:lang="es" mergetype="javax.help.SortMerge" >
      <name>Index</name>
      <label>Indice</label>
      <type>javax.help.IndexView</type>
      <data>index.xml</data>
   </view>

   <view >
     <name>Buscar</name>
     <label>Buscar</label>
     <type>javax.help.SearchView</type>
        <data engine="com.sun.java.help.search.DefaultSearchEngine">
        JavaHelpSearch
        </data>
   </view>
  <!-- A favorites navigator -->
  <view>
     <name>favorites</name>
     <label>Favorites</label>
     <type>javax.help.FavoritesView</type>
  </view>

</helpset>
