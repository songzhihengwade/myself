package myself.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper()
public interface IndexMapper {
    public List<String> getAllUserName();
}
