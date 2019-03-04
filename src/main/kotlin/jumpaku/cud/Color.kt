package jumpaku.cud


data class Color(val red: Double, val green: Double, val blue: Double, val opacity: Double) {

    companion object {

        fun rgb(red: Int, green: Int, blue: Int, opacity: Int = 255): Color = Color(
            (red/255.0).coerceIn(0.0..1.0),
            (green/255.0).coerceIn(0.0..1.0),
            (blue/255.0).coerceIn(0.0..1.0),
            (opacity/255.0).coerceIn(0.0..1.0))
    }
}
