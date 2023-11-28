package com.ongvee.productservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

// @Document thường dùng cho mongoDB còn @table dùng cho oracle và postgresql
// @AllArgsConstructor sử dụng để tự động tạo một constructor với tất cả các tham số
// @NoArgConstructor sử dụng để tạo một constructor không có tham số
// @Builder: Lombok annotation để tạo một builder pattern cho class.
// Builder pattern là một mẫu thiết kế giúp xây dựng đối tượng có thể được cấu hình linh hoạt thông qua các phương thức set.
// Nó làm cho mã nguồn trở nên rõ ràng hơn khi bạn có nhiều tham số tùy chọn khi tạo đối tượng.
// @Data: Lombok annotation để tự động tạo các phương thức getter, setter, equals, hashCode, và toString cho tất cả các trường (fields) của class. Điều này giúp giảm bớt mã boilerplate và làm cho code ngắn gọn hơn.
@Document(value = "product")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Product {

    private String id;
    private String name;
    private String description;
    private BigDecimal price;
}
