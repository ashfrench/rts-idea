package com.ash.rts.idea.model

import com.ash.rts.ideal.com.ash.rts.idea.model.MapGenerator
import org.junit.jupiter.api.DynamicTest
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestFactory
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class MapGeneratorTest {

    @Test
    fun `test generator default map size`() {
        val rtsMap = MapGenerator.generateMap()
        assertEquals(17215011, rtsMap.voxels.size)
    }

    @TestFactory
    fun `test factory generator default map range size`(): List<DynamicTest> {
        val xList = listOf(0, 10000)
        val yList = listOf(0, 10000)
        val zList = listOf(-5, 10)

        val voxels = xList.flatMap { x ->
            yList.flatMap { y ->
                zList.map { z ->
                    Voxel(x, y, z)
                }
            }
        }

        val rtsMap = MapGenerator.generateMapRange()
        return voxels.map { voxel ->
            DynamicTest.dynamicTest("$voxel is in Default Map") {
                assertTrue ("$voxel not in map") { voxel in rtsMap }
            }
        }
    }

    @TestFactory
    fun `test factory generator default map range out of range`(): List<DynamicTest> {
        val xList = listOf(-1, 0 , 10001)
        val yList = listOf(-1, 0, 10001)
        val zList = listOf(-6, 0, 11)

        val voxels = xList.flatMap { x ->
            yList.flatMap { y ->
                zList.map { z ->
                    Voxel(x, y, z)
                }.filterNot { it.x == 0 && it.y == 0 && it.z == 0 }
            }
        }

        val rtsMap = MapGenerator.generateMapRange()
        return voxels.map { voxel ->
            DynamicTest.dynamicTest("$voxel is not in Default Map") {
                assertFalse ("$voxel in map") { voxel in rtsMap }
            }
        }
    }

}