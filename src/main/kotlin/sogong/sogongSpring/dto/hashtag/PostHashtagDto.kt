package sogong.sogongSpring.dto.hashtag

import java.io.Serializable

data class PostHashtagDto(
    val postId: Long,
    val hashName: List<String>
) : Serializable