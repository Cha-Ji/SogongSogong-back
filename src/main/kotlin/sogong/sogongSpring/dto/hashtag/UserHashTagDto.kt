package sogong.sogongSpring.dto.hashtag

import java.io.Serializable

data class UserHashTagDto(
    val userId: Long,
    val groupId: Long,
    var hashName: List<String>
) : Serializable