# Even Japan’s most powerful supercomputer got hacked — what about the files on your phone?

## — Behind the breach of the Fugaku supercomputer: a sober reflection on your last line of defence

On November 12, Fugaku, one of the world’s top-ranked supercomputers, was compromised.

This is no Hollywood hacker showdown — no countdown timers, no flashing red alerts, no dramatic race to hit enter at the final second and save the day.

The reality is far less cinematic, yet far more chilling.

In a quiet advisory released on November 16 by Japan’s RIKEN research institute, an external unauthorised party gained access to Fugaku’s operation and maintenance systems on November 12. The incident affected 4,222 registered Fugaku users plus 375 users of another supercomputer, RIKEN, totalling up to 4,597 people. Exposed assets include personal profiles held in the user authentication system, alongside some files stored in users’ home directories.

**Some files stored in users’ home directories.**

This line deserves pause. What is Fugaku? It is Japan’s flagship, nation-backed supercomputer. It once claimed the global number-one spot and remains among the world’s leading systems. Its users are Japan’s foremost researchers: physicists, drug developers, climate modellers, materials scientists. The research data they store on Fugaku may contain unpublished papers, undisclosed experimental findings, and core patents not yet filed.

This material was subject to unauthorised access.

---

## 2026: Japan’s year of data-security collapses

If you think Fugaku is an isolated case, consider this timeline of events unfolding across Japan in 2026:

**January.** The “Yakiniku no Ousama” app, owned by Japan’s Monogatari Dining Group, suffered illegal access. Data for more than 9.6 million registered users was leaked — roughly one in thirteen Japanese people.

**March.** Servers of major discount retailer Mr Max Holdings were breached, putting records for around 1.73 million members at risk of exposure.

**May.** Up to 170,000 records from Daiki Suisan may have leaked.

**June.** Around 220,000 client records at Daiwa Securities were potentially exposed.

**August.** Sagawa Express, one of Japan’s largest logistics firms, faced unauthorised system access. As many as 53.23 million personal records may have been compromised — nearly half of Japan’s population.

**November.** Osaka Metropolitan University fell victim to ransomware, endangering records for at least 130,000 staff and students. That same month, Fugaku was hacked.

Within a single year, critical sectors across Japanese society — retail, catering, finance, logistics, education and scientific research — have all been hit by data-security failures.

**No sector is safe. No system is unbreakable.**

---

## A stark conclusion

Fugaku’s security team is no amateur outfit. RIKEN ranks among Japan’s premier research institutions and runs a dedicated cybersecurity division. Fugaku’s operational stack features layered protections, access auditing and intrusion detection.

Still, it was breached.

Sagawa Express’s IT infrastructure is far from basic. As a logistics leader, it commands security budgets worth hundreds of millions of yen, undergoes compliance reviews and third-party security assessments.

Even so, 53.23 million records stood at risk.

**If organisations equipped with specialist teams, massive budgets and formal compliance workflows cannot guarantee their data stays unbreached — what does that say about the files sitting on our phones, laptops and cloud drives?**

The answer does not need stating. You already know it.

---

## There is a gate between “being breached” and “data leaking”

Here is a vital distinction many people conflate: the two concepts are vastly different.

**Being breached** means attackers have successfully entered your system. They bypass firewalls, evade intrusion detection and obtain internal access privileges.

**Data leakage** means attackers, once inside, successfully extract valuable data. They view files, copy records and exfiltrate information.

Between breach and leakage stands one gate.

That gate is **encryption**.

If data on the system is stored in plaintext: breach equals leakage. Once attackers get in, they see everything.

If data is encrypted with keys held by the service provider: breach is nearly equivalent to leakage. Attackers can retrieve the keys alongside the ciphertext and convert it back into readable plaintext.

But if data is encrypted with keys held solely by the end user: **breach does NOT equal leakage.** Attackers break in and grab ciphertext, yet the keys live elsewhere. The encrypted data means nothing to them. They leave empty-handed.

**Fugaku’s problem was not merely that it was hacked. It was that users’ home-directory files could be read after the breach.**

If that research data had been client-side encrypted before storage, with decryption keys kept only on researchers’ personal devices, then even full compromise of Fugaku’s operational systems would leave attackers holding nothing but useless ciphertext. That ciphertext would shield unpublished papers and pending patents.

That was not the case. Hence the research files and personal data of 4,597 users were placed at risk.

---

## The last line of defence

Security professionals talk about defence in depth: do not rely on a single safeguard; stack multiple protective layers.

Firewalls are the first layer. Intrusion detection the second. Access controls the third.

Yet all these safeguards share one trait for personal data: **they work by keeping attackers out.**

The trouble is, they can fail.

Fugaku’s safeguards failed. Sagawa Express’s safeguards failed. Even the FBI’s recruitment website was breached this year, and so was Kernel.sh, a core global infrastructure platform for developers.

**When keeping intruders out can no longer be guaranteed, you need a different kind of defence — not one that blocks entry, but one that ensures data cannot be taken.**

That is encryption. Not the pseudo-encryption where the provider holds the keys. True end-user-held encryption, where even the service operator cannot unlock your files.

**True encryption is your final line of defence. It is not designed to stop hacks — it is designed to make hacks pointless.**

---

## DoraBox: built for that last line of defence

DoraBox is clearly positioned: it is not a cloud drive, not a file manager, not a productivity utility. **It is an encrypted safe.**

Its design serves one core goal: **no matter what happens — whether a device is compromised, an account is stolen, or the provider’s servers get hacked — your stored data stays unexposed.**

Four core design choices make this possible:

**Keys stay exclusively on your device.**
Zero-knowledge architecture. Encryption keys are generated locally on your hardware and never leave it, never get uploaded to servers. The DoraBox development team does not hold copies of your keys. There is no “password recovery” route, because no one can recover a key that exists only on your device.

This means: even if DoraBox’s servers suffer a breach on the scale of Fugaku, attackers obtain nothing but ciphertext.

**No plaintext window anywhere in the full pipeline.**
Data is encrypted on your device before transmission. It travels as ciphertext, rests on the server as ciphertext, and remains encrypted after syncing to your other devices. There is zero moment from creation to viewing where plaintext is exposed.

There are no plaintext relay points. Any interception at any layer yields only encrypted data.

**Post-quantum-ready cryptography.**
It currently uses AES-256-GCM paired with Argon2id key derivation and X25519 key encapsulation. The architecture is built to support future post-quantum algorithm upgrades.

This is not paranoia. The security community widely recognises the “harvest now, decrypt later” attack vector: state-backed adversaries are systematically hoarding today’s encrypted data, waiting for mature quantum computers to decrypt it at scale. Data you store in 2026 may be targeted for cracking in 2035.

DoraBox’s post-quantum roadmap is built to render that waiting game futile.

**Brute-force attempts end in key erasure.**
After repeated failed authentication attempts, the local key is wiped. The encrypted files remain, yet they become meaningless noise until you complete your full identity recovery workflow.

A brute-force attack does not unlock the safe — it makes the safe’s key disappear. Attackers are not racing against time; they are racing against a self-protection trigger they cannot beat.

---

## Back to Fugaku

RIKEN stated in its advisory that it notified Japan’s Ministry of Education, Culture, Sports, Science and Technology on November 13, and is investigating the intrusion root cause, scoping impact and rolling out security remediation.

This is standard incident response: report, investigate, patch.

But for those 4,597 affected users, their personal details and research data were already at risk of being exfiltrated. Even if RIKEN patches every vulnerability tomorrow, data that has left the system cannot be brought back.

**Remediation after a perimeter breach fixes the defences — it does not recover leaked data.**

Once data escapes, it is gone forever. It can be copied endlessly, resold repeatedly, and weaponised for targeted attacks for years. You patch firewalls, rotate passwords and deploy fixes — but that leaked data will circulate on underground networks for a very long time.

That is why the final defensive layer matters so deeply.
All outer barriers can fall. The last layer — encryption — ensures that even when everything else fails, your most sensitive material stays out of reach.

---

## A three-minute assessment you can run today

This takes almost no time.

Think about what you keep on your phone and laptop that would put you in serious trouble if leaked:

- ID photos
- Bank card details
- Scanned contracts
- Payslips and financial records
- Anything you would never want strangers to see

Where are these files? In your photo gallery? Inside your files app? On some cloud storage service?

**Are they encrypted with strong encryption that stays secure even if someone gets hold of the raw file?**

If you cannot be certain, what you need is not a better firewall or a stronger password. You need that final line of defence.

Fugaku had elite security teams and budgets running into hundreds of millions of yen — and it still got hacked.

What stands guard over the sensitive files on your phone?

---

*DoraBox — encrypted private-data storage, zero-knowledge architecture, local key management, full pipeline plaintext-free design, built for the post-quantum era.*