package com.ash.rts.idea.model

import com.ash.rts.ideal.com.ash.rts.idea.model.MapGenerator
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class MapGeneratorTest {

    @Test
    fun `test generator default map size`() {
        val rtsMap = MapGenerator.generateMap()
        assertEquals(17215011, rtsMap.voxels.size)
    }

}