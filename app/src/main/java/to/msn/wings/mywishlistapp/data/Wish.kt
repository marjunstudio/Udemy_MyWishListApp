package to.msn.wings.mywishlistapp.data

data class Wish(
    val id: Long = 0L,
    val title: String = "",
    val description: String = ""
)

object DummyWish {
    val wishList = listOf(
        Wish(title = "Google Watch 2", description = "An android Watch"),
        Wish(title = "車", description = "日常の買い物や移動を楽にする"),
        Wish(title = "本", description = "自己投資"),
        Wish(title = "パソコン", description = "日々の生産性を高める"),

    )
}