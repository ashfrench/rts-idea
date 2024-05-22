package com.ash.rts.idea.model

interface Attack {

    fun availableAttacks(): Set<HitBox>

}