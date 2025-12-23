package com.personal.blogapp.users;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.*;

@Entity(name = "Users")
@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable = false)
    private Long id;

    @Column(nullable = false)
    @NonNull
    private String username;

    @Column(nullable = false)
    @NonNull
    private String email;

    @Nullable
    private String bio;

    @Nullable
    private String image;
}
