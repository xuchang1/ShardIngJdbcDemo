package dao;

import com.study.Main;
import com.study.entity.Position;
import com.study.repository.PositionRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author changxu13
 * @date 2020/10/17 16:51
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Main.class)
public class ShardingDatabaseTest {

	@Resource
	private PositionRepository positionRepository;

	@Test
	public void addTest() {
		for (long i = 1; i < 20; i++) {
			Position position = new Position();
//			position.setId(i);
			position.setName("xiaoming" + i);
			position.setSalary("1000000");
			position.setCity("合肥");
			positionRepository.save(position);
		}
	}
}
