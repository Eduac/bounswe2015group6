package application.repository;

import application.core.TagPostRelation;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface TagPostRelationRepository extends CrudRepository<TagPostRelation, Integer>{
    ArrayList<TagPostRelation> findAll();
    ArrayList<TagPostRelation> findByPostId(int postId);
    ArrayList<TagPostRelation> findByTagId(int TagId);
    void deleteByTagId(int tagID);
}