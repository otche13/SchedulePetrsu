package ru.otche13.schedulepetrsu.domain.use_case

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import ru.otche13.schedulepetrsu.domain.model.ScheduleItem
import ru.otche13.schedulepetrsu.domain.repository.FirebaseRepository
import ru.otche13.schedulepetrsu.utils.Resource
import javax.inject.Inject

class GetScheduleListUseCase @Inject constructor(
    private val firebaseRepository: FirebaseRepository
) {
    operator fun invoke(): Flow<Resource<List<ScheduleItem>>> = flow {
         firebaseRepository.getScheduleList()
    }
}