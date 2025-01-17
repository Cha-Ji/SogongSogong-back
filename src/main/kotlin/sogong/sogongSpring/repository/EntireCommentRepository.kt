package sogong.sogongSpring.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository
import sogong.sogongSpring.entity.EntireCommentEntity
import sogong.sogongSpring.entity.EntirePostEntity
import sogong.sogongSpring.entity.UserLoginEntity

@Repository
interface EntireCommentRepository : JpaRepository<EntireCommentEntity, Long> {
    fun findByCommentIdAndUserIdAndPostId(commentId:Long, userId:UserLoginEntity, postId:EntirePostEntity) : List<EntireCommentEntity>
    fun findByPostId(postId:EntirePostEntity) : List<EntireCommentEntity>

    @Query(value = "select * from ENTIRE_COMMENT where postId = :postId", nativeQuery = true)
    fun selectPost(@Param(value="postId") postId : Long) : MutableList<EntireCommentEntity>
}