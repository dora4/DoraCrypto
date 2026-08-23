package com.doracrypto.crypto.ui.adapter

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.doracrypto.crypto.R
import com.doracrypto.crypto.model.Card

class CardAdapter : BaseQuickAdapter<Card, BaseViewHolder>(R.layout.item_card) {

    override fun convert(holder: BaseViewHolder, item: Card) {
        holder.setText(R.id.tv_card_title, item.title)
        holder.setText(R.id.tv_card_content, item.content)
    }
}