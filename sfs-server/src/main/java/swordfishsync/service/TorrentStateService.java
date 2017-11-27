package swordfishsync.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import swordfishsync.domain.TorrentState.Status;
import swordfishsync.service.dto.TorrentDto;

public interface TorrentStateService {
	
	Page<TorrentDto> getTorrentStatesByStatuses(List<Status> statuses, Pageable pageable);
	
}