package com.example.tipsdesaluderubiel.modelo;

import android.support.annotation.NonNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;


public class ModeloArticulos {


    public static final List<Articulo> ITEMS = new ArrayList<Articulo>();


    public static final Map<String, Articulo> MAPA_ITEMS = new HashMap<String, Articulo>();

    static {
        // Añadir elementos de ejemplo
        agregarItem(new Articulo(generarId(),
                "10 Plantillas Para Determinar Tus Necesidades Calóricas",
                "Descarga nuestras plantillas para Microsoft Excel que te permitirán, calcular exactamente...",
                "10 de Enero", "https://cdn2.cnet.com/img/VcjARNnYtd1qwbOCueNf3bnOlhc=/1092x0/2019/03/14/70b49c1d-0d3b-4b75-9225-b898b83cdc9a/avengers-endgame-poster-og-social-crop.jpg"));
                agregarItem(new Articulo(generarId(),
                "¿Qué Tan Malo Es Consumir Chocolate?",
                "Si aún no has podido resolver tus dudas sobre comer chocolate, entonces este artículo es para ti...",
                "11 de Enero", "https://www.rockhall.com/sites/default/files/styles/header_image_portrait/public/acdchero_web.jpg?itok=9mel4cOs"));
        agregarItem(new Articulo(generarId(),
                "Guía Para Identificar Alimentos Con Trigo Perjudiciales",
                "Aprende a distinguir aquellos alimentos que están hechos de trigo mal procesado...",
                "12 de Enero", "http://static1.squarespace.com/static/58f4f0c4d2b8579e6b3f88ed/t/5902a889a5790a0fc5f13006/1493346442177/fob.jpg?format=1500w"));
        agregarItem(new Articulo(generarId(),
                "Descubre Qué Harían 10 Minutos De Ejercicio Diario En Tu Cuerpo",
                "Entra y descubre los beneficios de realizar una rutina de 10 minutos los 7 días...",
                "13 de Enero", "https://studentedgeapplication.azureedge.net/articles/7212cd8b-0187-4d50-aa2e-7fc3c47fec56.jpg"));
        agregarItem(new Articulo(generarId(),
                "Aumentando Las Defensas Del Cuerpo Con Frutos Rojos",
                "Los frutos rojos frecuentemente son ignorados por la mayoría de las personas, pero hoy te mostraremos...",
                "14 de Enero", "https://www.reconoce.mx/wp-content/uploads/2017/09/zoviet-1.png"));
        agregarItem(new Articulo(generarId(),
                "5 Recetas Bajas En Grasa Para El Almuerzo",
                "Variar las recetas a la hora de alimentarse permite obtener distintos beneficios dependiendo del alimento, ...",
                "15 de Enero", "https://i1.wp.com/www.sopitas.com/wp-content/uploads/2018/06/the-rasmus-concierto-mexico.jpg"));
        agregarItem(new Articulo(generarId(),
                "Combina Cardio + Fuerza Para Obtener Verdaderos Resultados",
                "Muchos creen que solo realizar ejercicios de cardio los hará perder de peso y...",
                "16 de Enero", "https://www.rockzonemag.com/wp-content/uploads/2018/11/Twenty_One_Pilots_Foto_2018_rockzone-1021x462.gif"));
        agregarItem(new Articulo(generarId(),
                "Planificador Semanal Para Optimizar Tu Dieta",
                "Descarga nuestro nueva plantilla para prácticar buenos hábitos alimenticios. Se trata de...",
                "17 de Enero", "https://i1.wp.com/www.sopitas.com/wp-content/uploads/2018/08/foster-the-people-concierto-cdmx-1120x581.jpg"));
        agregarItem(new Articulo(generarId(),
                "Las 30 Razones De Por Qué Superman Come Cacahuates",
                "Los frutos secos han sido desde la antiguedad la principal fuente de proteínas para muchas civilizaciones...",
                "18 de Enero", "https://www.gorillaz.com/images/og.jpg"));

    }

    @NonNull
    private static String generarId() {
        return UUID.randomUUID().toString();
    }


    private static void agregarItem(Articulo item) {
        ITEMS.add(item);
        MAPA_ITEMS.put(item.id, item);
    }



    public static class Articulo {

        public final String id;

        public final String titulo;

        public final String descripcion;

        public final String fecha;

        public final String urlMiniatura;

        public Articulo(String id, String titulo, String descripcion,
                        String fecha, String urlMiniatura) {
            this.id = id;
            this.titulo = titulo;
            this.descripcion = descripcion;
            this.fecha = fecha;
            this.urlMiniatura = urlMiniatura;
        }
    }
}
