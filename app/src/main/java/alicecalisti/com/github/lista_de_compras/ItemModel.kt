package alicecalisti.com.github.lista_de_compras

data class ItemModel(
    val name: String,
    val onRemove: (ItemModel) -> Unit = { _ -> }
)