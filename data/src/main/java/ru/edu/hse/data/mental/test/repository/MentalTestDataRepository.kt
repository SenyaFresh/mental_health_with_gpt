package ru.edu.hse.data.mental.test.repository

import kotlinx.coroutines.flow.Flow
import ru.edu.hse.common.ResultContainer
import ru.edu.hse.data.mental.test.entities.MentalTestDataEntity
import ru.edu.hse.data.mental.test.entities.MentalTestQuestionEntity

interface MentalTestDataRepository {

    /**
     * Get depression test.
     */
    fun getMentalTest() : Flow<ResultContainer<MentalTestDataEntity>>

    /**
     * Set mental test answer.
     */
    suspend fun setMentalTestAnswer(mentalQuestion: MentalTestQuestionEntity, answer: String)

}