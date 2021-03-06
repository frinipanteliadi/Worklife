package com.linkedin.model.experience;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@ApiModel(description = "user's Experience Dto")
public class ExperienceDto {

  @NotNull
  @ApiModelProperty(value = "ExperienceId ", example = "1", position = 1)
  private Long experienceId;

  @ApiModelProperty(value = "userId ", example = "1", position = 2)
  private Long userId;

  @NotBlank
  @ApiModelProperty(value = "Title ", example = "Software Engineer", position = 3)
  private String title;

  @NotBlank
  @ApiModelProperty(value = "Company Name", example = "Google", position = 4)
  private String company;

  @NotNull
  @ApiModelProperty(value = "Date started", example = "2010-01-01", position = 5)
  private Date startDate;

  @NotNull
  @ApiModelProperty(value = "Date ended", example = "2018-01-01", position = 6)
  private Date endDate;

  @NotNull
  private Integer visible;

}
