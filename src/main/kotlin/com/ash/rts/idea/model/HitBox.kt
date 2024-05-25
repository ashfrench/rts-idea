package com.ash.rts.idea.model

data class HitBox(
    val voxels: Set<Voxel> = emptySet()
): Set<Voxel> by voxels {
    constructor(voxel: Voxel): this(setOf(voxel))
}

operator fun HitBox.plus(hitBox: HitBox): HitBox = HitBox(voxels + hitBox.voxels)
fun Collection<HitBox>.toHitBox() = fold(HitBox()) { old, new -> old + new }