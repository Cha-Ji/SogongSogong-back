package sogong.sogongSpring.dto.boardedit

import java.io.Serializable

data class DeleteCommentDto(
    val commmentId : Long,
    val postId : Long
) : Serializable