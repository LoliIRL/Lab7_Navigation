package com.example.mycity

// 1. Класс для описания одного места
data class Place(
    val id: Int,
    val name: String,
    val description: String,
    val imageRes: Int
)

// 2. Класс для категории (содержит список мест)
data class Category(
    val name: String,
    val imageRes: Int,
    val places: List<Place>
)

// 3. Наш "источник данных"
object CityData {
    val categories = listOf(
        Category(
            name = "Кофейни",
            imageRes = R.drawable.coffee1,
            places = listOf(
                Place(1, "Coffee Bean", "Уютная кофейня с лучшим капучино в городе.", R.drawable.coffee1),
                Place(2, "Sweet Bakery", "Свежие круассаны и десерты каждое утро.", R.drawable.coffee2),
                Place(3, "Loft Cafe", "Стильный интерьер и отличный вид из окна.", R.drawable.coffee3)
            )
        ),
        Category(
            name = "Парки",
            imageRes = R.drawable.park1,
            places = listOf(
                Place(4, "Central Park", "Огромный парк с вековыми деревьями и аллеями.", R.drawable.park1),
                Place(5, "Lake Side", "Тихое место с озером и фонтаном.", R.drawable.park2),
                Place(6, "Sunny Lawn", "Любимое место для пикников и прогулок.", R.drawable.park3)
            )
        ),
        Category(
            name = "Кинотеатры",
            imageRes = R.drawable.cinema1,
            places = listOf(
                Place(7, "Popcorn Cinema", "Здесь всегда свежий попкорн и громкий звук.", R.drawable.cinema1),
                Place(8, "Red Hall", "VIP-зал с красными креслами.", R.drawable.cinema2),
                Place(9, "IMAX Space", "Огромный экран для настоящих ценителей.", R.drawable.cinema3)
            )
        ),
        Category(
            name = "Торговые центры",
            imageRes = R.drawable.mall1,
            places = listOf(
                Place(10, "City Mall", "Главный ТЦ города с эскалаторами.", R.drawable.mall1),
                Place(11, "Fashion Street", "Бутики известных брендов.", R.drawable.mall2),
                Place(12, "Grand Plaza", "Огромное здание с магазинами и кино.", R.drawable.mall3)
            )
        )
    )
}