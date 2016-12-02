package com.teamtreehouse.giflib.dao;

import com.teamtreehouse.giflib.model.Gif;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GifDao extends CrudRepository<Gif, Long>{
}
